public class energydrinks {
    

    public static void main(String args[]) {

        BasicCola cola = new BasicCola(0, 0);  

    System.out.println("BasicCola:");
    System.out.println("  water weight: " + cola.getWater() + " g"); 
    System.out.println("  sugar weight: " + cola.getSugar() + " g"); 
    System.out.println("  caffeine weight: " + cola.getCaffeine() + " g"); 

    System.out.println("  weight today: " + cola.weight() + " g"); 
    System.out.println("  weight after 10 years: " + cola.weight(10) + " g");

    System.out.println();

    NukaCola nuka = new NukaCola(7.0);  // we only pass cesium, sugar=10.0 and caffeine=12.0 are constants

    System.out.println("NukaCola:");
    System.out.println("  water weight: " + nuka.getWater() + " g"); 
    System.out.println("  sugar weight: " + nuka.getSugar() + " g"); 
    System.out.println("  caffeine weight: " + nuka.getCaffeine() + " g"); 

    System.out.println("  cesium weight today: " + nuka.getCesium() + " g"); 
    System.out.println("  cesium weight after 10 years: " + nuka.cesiumLeft(10) + " g"); 
    System.out.println("  weight today: " + nuka.weight() + " g"); 
    System.out.println("  weight after 10 years: " + nuka.weight(10) + " g");

    }


    public class BasicCola {
        private double water; 
        private double sugar; 
        private double caffeine; 

        public BasicCola(double sugar, double caffeine) {
             //holds ony sugar and caffeine, water is always 300g. They are the ingredients of BasiCola.
            this.water = 300; 
            this.sugar = sugar; 
            this.caffeine = caffeine; 
        }

        //These methods returns a value for every empty field in the main: water, sugar, caffeine, weight now and after 10 yrs
        public double getWater () {
            return this.water;
        }

        public double getSugar () {
            return this.sugar;
        }

        public double getCaffeine () {
            return this.caffeine;
        }

        public double weight () {
            return this.water + this.caffeine + this.sugar; 
        }

        public double weight(int nYears) {
            return this.weight(); 
        }
    }


    public class NukaCola extends BasicCola{
        
        private double cesium; 

        public NukaCola(double cesium) {
            super(10, 12); 
            this.cesium = cesium; 
        }

        public double getCesium() {
            return this.cesium; 
        }

        public double weight () {
            return super.weight() + this.cesium; 
        }
        
        public double cesiumLeft(int nYears){
            return this.cesium * Math.pow(0.97716, nYears);
        }

        public double weight (int nYears) {
            return this.weight() + this.cesiumLeft(nYears); 
        }
    }




    
}
