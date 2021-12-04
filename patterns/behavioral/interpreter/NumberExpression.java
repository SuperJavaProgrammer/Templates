package behavioral.interpreter;

class NumberExpression implements Expression {
    private int number;

    NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
