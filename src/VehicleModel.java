public class VehicleModel {

    VehicleModel(){
        //Default Constructor
        System.out.println("Vehicle Model");
    }

    VehicleModel(String model){
        System.out.println("Model Name = "+model);
    }

    public static void main(String[] args) {
        VehicleModel v1 = new VehicleModel();
        VehicleModel v2 = new VehicleModel("Audi R8 Spyder");
        VehicleModel v3 = new VehicleModel("Porsche 992");
    }
}
