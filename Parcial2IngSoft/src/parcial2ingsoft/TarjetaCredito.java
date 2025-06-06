package parcial2ingsoft;

public class TarjetaCredito {
    private String numero;
    private String vencimiento;
    private String titular;
    private String cvv;

    public TarjetaCredito(String numero, String vencimiento, String titular, String cvv) {
        this.numero = numero;
        this.vencimiento = vencimiento;
        this.titular = titular;
        this.cvv = cvv;
    }

    public TarjetaCredito() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
    // Implementación simple del algoritmo de Luhn para validar el número
    public boolean esNumeroValido() {
        int sum = 0;
        boolean alternate = false;
        for (int i = numero.length() - 1; i >= 0; i--) {
            int n = Character.getNumericValue(numero.charAt(i));
            if (alternate) {
                n *= 2;
                if(n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
    
    // Devuelve el número de tarjeta enmascarado (mostrando solo los últimos 4 dígitos)
    public String obtenerNumeroEnmascarado() {
        if(numero != null && numero.length() > 4) {
            String ultimos4 = numero.substring(numero.length() - 4);
            return "**** **** **** " + ultimos4;
        }
        return numero;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "numero='" + obtenerNumeroEnmascarado() + '\'' +
                ", vencimiento='" + vencimiento + '\'' +
                ", titular='" + titular + '\'' +
                '}';
    }
}
