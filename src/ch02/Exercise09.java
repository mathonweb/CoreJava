public class Exercise09 {
    class car {
        private double nbMiles;
        private double nbGallons;
        private double fuelEfficiency;

        car(double nbMiles, double nbGallons, double fuelEfficiency){
            this.nbMiles = nbMiles;
            this.nbGallons = nbGallons;
            this.fuelEfficiency = fuelEfficiency;
        }

        car(double fuelEfficiency){
            this(0,0, fuelEfficiency);
        }

        public car setNbMiles(double nb){
            nbMiles = nb;
            return this;
        }

        public car setNbGallons(double nb){
            nbGallons = nb;
            return this;
        }

        private double getNbMiles(){
            return this.nbMiles;
        }

        private double getNbGallons(){
            return this.nbGallons;
        }

        double getFuelEfficiency(){
            return this.fuelEfficiency;
        }

        // Methods to update values
        void setAddMiles(double nbMiles){
            setNbMiles(getNbMiles() + nbMiles);
            setNbGallons(getNbGallons() - getFuelEfficiency()*nbMiles);
        }

        void setAddGallons(double nbGallons){
            setNbGallons(getNbGallons() + nbGallons);
        }

    }

    public static void main(String[] args) {
        //Exercise #9
        System.out.println("Exercise #9");
        car mustang = new Exercise09().new car(0,40,5);
        // After 50 miles
        mustang.setAddMiles(5);
        System.out.println("Fuel Efficiency = " + mustang.getFuelEfficiency());
        System.out.println("Number of gallons remaining = " + mustang.getNbGallons());
        System.out.println("It cannot be an immutable class, because we need to modify the class object");
    }
}
