package com.dsl.enumerate;

import java.util.*;

class Calculator
{
    private Operator operator;
    private List<Map<Operator, Map<String, Double>>> evaluators = new ArrayList<>();
    private double total;

    Calculator() { }

    double calculate(double v1, double v2)
    {
        return operator.getEvaluator().evaluate(v1, v2);
    }

    Calculator chain(double value)
    {
        Map<String, Double> valueMap = new LinkedHashMap<>();
        valueMap.put("v2", value);

        return store(operator, valueMap);
    }

    Calculator chain(Operator operator, double value)
    {
        Map<String, Double> valueMap = new LinkedHashMap<>();
        valueMap.put("v2", value);

        return store(operator, valueMap);
    }

    Calculator chain(Operator operator, double v1, double v2)
    {
        Map<String, Double> valueMap = new LinkedHashMap<>();
        valueMap.put("v1", v1);
        valueMap.put("v2", v2);

        return store(operator, valueMap);
    }

    double calculate()
    {
        evaluators.stream().map(Map::entrySet).flatMap(Collection::stream).filter(entry -> Objects.nonNull(entry.getKey()))
                .forEach(entry -> {
                    Map<String, Double> valueMap = entry.getValue();
                    total = entry.getKey().getEvaluator().evaluate(Objects.isNull(valueMap.get("v1")) ? total : valueMap.get("v1"), valueMap.get("v2"));
                });

        evaluators.clear();
        return total;
    }

    void setOperator(Operator operator)
    {
        this.operator = operator;
    }

    private Calculator store(Operator operator, Map<String, Double> valueMap)
    {
        setOperator(operator);
        Map<Operator, Map<String, Double>> evaluatorMap = new LinkedHashMap<>();
        evaluatorMap.put(operator, valueMap);
        evaluators.add(evaluatorMap);

        return this;
    }
}
