package aula7;

public class EqXn extends Equacao {
    private double xn;
    private double xp;

    public double calculaXn(Delta d) {
        xn=(-d.getB()-Math.sqrt(d.getDelta()))/(2*d.getA());
    return xn;
}

public double calculaXp(Delta d) {
    xp=(-d.getB()-Math.sqrt(d.getDelta()))/(2*d.getA());
return xp;
}

}