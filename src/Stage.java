import java.util.Scanner;

public class Stage {
  private int quantity;

  public void start() {
    Scanner sc = new Scanner(System.in);
		System.out.println("사용량을 입력하세요.");
    quantity = sc.nextInt();

    // code here
    Calculation calculation = new Calculation(quantity);
    System.out.println("기본요금 : " + calculation.basicFee);
    System.out.println("전력량요금 : " + calculation.energyCharge);
    System.out.println("기후환경요금 : " + calculation.environmentChange);
    System.out.println("전기요금계 : " + calculation.electricityBill);
    System.out.println("부가가치세 : " + calculation.vatFee);
    System.out.println("전력기반기금 : " + calculation.forceDevelopmentCharge);
    System.out.println("청구금액 : " + calculation.totalPrice);
  }
}
