public class Thermometer {
    double temperature;

    public Thermometer(double temperature) {
        this.temperature = temperature;
    }

    private short Temp (double temp) {
        return (short) Math.round(temp);
    }
    public double CelsiusFahrenheit(){
        return Math.round(( temperature * 1.8) + 32);
    }
    public double FahrenheitCelsius(){
        return Math.round((temperature-32)/1.8);
    }
}
// Полчаса тупил из-за того что не знал ключевого слова this :(