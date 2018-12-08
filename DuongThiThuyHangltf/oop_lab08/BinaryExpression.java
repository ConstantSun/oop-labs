public abstract class BinaryExpression extends Expression {
    abstract public Expression left();
    abstract public Expression right();
    protected Expression left;
    protected Expression right;
}
