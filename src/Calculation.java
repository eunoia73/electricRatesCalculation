public class Calculation {

  // code here

    int quantity;  //사용한 전력량

    int basicFee;  //기본 요금
    int energyCharge;  //전력량 요금
    int environmentChange;  //기후환경 요금
    int electricityBill;  //전기요금
    int vatFee;  //부가가치세
    int forceDevelopmentCharge;//전력기반기금
    int totalPrice;//청구금액

    //생성자
    public Calculation(int quantity) {
        this.quantity = quantity;
        basic();
        electricEnergy();
        climateEnvironment();
        electricity();
        vat();
        forceDevelopment();
        totalPrice();
    }

    //기본요금
    public void basic() {
        int basicFee;
        if (quantity <= 200) {
            basicFee = 910;
        } else if (211 <= quantity && quantity <= 400) {
            basicFee = 1600;
        } else {
            basicFee = 7300;
        }
        this.basicFee = basicFee;
    }

    //전력량 요금
    public void electricEnergy() {
        double energyCharge;
        if (0 <= quantity && quantity <= 200) {
            energyCharge = quantity * 120.0;
        } else if (quantity <= 400) {
            energyCharge = (200 * 120) + (quantity - 200) * 214.6;
        } else {
            energyCharge = (200 * 120) + (200 * 214.6) + (quantity - 400) * 307.3;
        }
        this.energyCharge = (int) energyCharge;
    }

    //기후환경 요금
    public void climateEnvironment() {
        int environmentChange = quantity * 9;
        this.environmentChange = environmentChange;
    }

    //전기요금
    public void electricity() {

//        int electricityBill = basic(quantity) + electricEnergy(quantity) + climateEnvironment(quantity);
        this.electricityBill = (int) (basicFee + energyCharge + environmentChange);
    }

    //부가가치세
    public void vat() {
        this.vatFee = (int) Math.round(electricityBill * 0.1);
    }

    //전력발전기금
    public void forceDevelopment() {
        this.forceDevelopmentCharge = (int) (electricityBill * 0.037 / 10) * 10;
    }

    //청구금액
    public void totalPrice() {
        this.totalPrice = (electricityBill + vatFee + forceDevelopmentCharge) / 10 * 10;
    }

}
