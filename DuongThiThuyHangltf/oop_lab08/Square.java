public class Square extends Expression {
    Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }
    public Square(){};

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate() {
        return expression.evaluate()*expression.evaluate() ;
    }

    @Override
    public String toString() {
        if( expression instanceof Numeral )
            return ""+ expression+"^2" ;
        else
            return "("+ expression+")^2" ;
    }
}
