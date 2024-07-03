package API;

public record ConversorApi(double conversion_result) {
    @Override
    public String toString() {
        return String.format("%.2f",conversion_result);
    }
}
