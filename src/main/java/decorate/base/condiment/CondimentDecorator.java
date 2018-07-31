package decorate.base.condiment;

import decorate.base.Beverage;

// 调料类
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
