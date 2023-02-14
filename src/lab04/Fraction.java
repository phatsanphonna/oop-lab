package lab04;

public class Fraction {
    public int topN;
    public int btmN;

    public String toFraction() {
        return String.format("%d/%d", topN, btmN);
    }

    public String toFloat() {
        return "" + (double) topN / btmN;
    }

    public void addFraction(Fraction f) {
        if (f.btmN == btmN) {
            topN += f.topN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }
}

