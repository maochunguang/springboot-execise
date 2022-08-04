package com.mcg.exercise.extension.swagger;

import com.fasterxml.classmate.ResolvedType;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.Collections;
import springfox.documentation.schema.Enums;
import springfox.documentation.service.AllowableValues;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.schema.EnumTypeDeterminer;
import springfox.documentation.spi.service.OperationBuilderPlugin;
import springfox.documentation.spi.service.contexts.OperationContext;
import springfox.documentation.spring.web.DescriptionResolver;
import springfox.documentation.swagger.schema.ApiModelProperties;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Strings.emptyToNull;
import static com.google.common.base.Strings.isNullOrEmpty;
import static springfox.documentation.swagger.common.SwaggerPluginSupport.SWAGGER_PLUGIN_ORDER;
import static springfox.documentation.swagger.common.SwaggerPluginSupport.pluginDoesApply;
import static springfox.documentation.swagger.schema.ApiModelProperties.allowableValueFromString;

/**
 * @author maocg
 */
@Order(SWAGGER_PLUGIN_ORDER)
public class ApiQueryModelParameterBuilder implements OperationBuilderPlugin {
    private final DescriptionResolver descriptions;
    private final EnumTypeDeterminer enumTypeDeterminer;

    @Autowired
    public ApiQueryModelParameterBuilder(
            DescriptionResolver descriptions,
            EnumTypeDeterminer enumTypeDeterminer) {
        this.descriptions = descriptions;
        this.enumTypeDeterminer = enumTypeDeterminer;
    }

    @Override
    public void apply(OperationContext context) {

//            context.parameterBuilder().name(emptyToNull(annotation.name()))
//                    .description(emptyToNull(descriptions.resolve(annotation.value())))
//                    .required(annotation.required()).parameterType("query");


        context.operationBuilder().parameters(readParameters(context));



    }

    private List<Parameter> readParameters(OperationContext context) {
        Optional<ApiQueryModel> apiParam = context.findAnnotation(ApiQueryModel.class);
        if (!apiParam.isPresent()) {
            return new ArrayList<>();
        }

        ApiQueryModel annotation = apiParam.get();
        List<Parameter> parameters = Lists.newArrayList();
//        for (ApiImplicitParam param : annotation.value()) {
//            parameters.add(implicitParameter(descriptions, param));
//        }
        return new ArrayList<>();
    }

    private Parameter implicitParameter(DescriptionResolver descriptions, ApiModelProperty param) {
        return new ParameterBuilder()
                .name(param.name())
                .description(descriptions.resolve(param.value()))
                .required(param.required())
                .allowableValues(allowableValueFromString(param.allowableValues()))
                .parameterType(emptyToNull(param.dataType()))
                .parameterAccess(param.access())
                .order(SWAGGER_PLUGIN_ORDER)
                .scalarExample(param.example())
                .build();
    }

    private Function<ApiParam, String> toAllowableValue() {
        return new Function<ApiParam, String>() {
            @Override
            public String apply(ApiParam input) {
                return input.allowableValues();
            }
        };
    }

    private AllowableValues allowableValues(ResolvedType parameterType, String allowableValueString) {
        AllowableValues allowableValues = null;
        if (!isNullOrEmpty(allowableValueString)) {
            allowableValues = ApiModelProperties.allowableValueFromString(allowableValueString);
        } else {
            if (enumTypeDeterminer.isEnum(parameterType.getErasedType())) {
                allowableValues = Enums.allowableValues(parameterType.getErasedType());
            }
            if (Collections.isContainerType(parameterType)) {
                allowableValues = Enums.allowableValues(Collections.collectionElementType(parameterType).getErasedType());
            }
        }
        return allowableValues;
    }

    @Override
    public boolean supports(DocumentationType delimiter) {
        return pluginDoesApply(delimiter);
    }
}
