public class Division extends BinaryExpression
{
    public Division(Expression numerical, Expression denominator)
    {
        left = numerical;
        right = denominator;
    }

    @Override
    public int evaluate() {
        return left.evaluate()/right.evaluate()  ;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public String toString() {
        return "("+ left+"/"+ right+")";
    }


    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }
}

