public class QRController {

    private QRHandler qrHandler;

    public QRController(String userId) {
        this.qrHandler = new QRHandler(userId);
    }

    public void showQR() {
        // סימולציה להדפסת QR למסך – בפועל מחובר ל־FXML
        System.out.println("=== QR Screen ===");
        System.out.println(qrHandler.generateCombinedQRContent());
    }
}
