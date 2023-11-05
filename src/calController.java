import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class calController {

    @FXML
    private Button divVal;

    @FXML
    private Button multVal;

    @FXML
    private TextField numberOne;

    @FXML
    private TextField numberTwo;

    @FXML
    private TextField resulFinal;

    @FXML
    private Button somaVal;

    @FXML
    private AnchorPane subVal;

    @FXML
    void dividindo(ActionEvent event) throws Exception {
        try {
            verificaDados(numberOne, numberTwo);
            Double v1,v2,re;
            String s;
            v1 = Double.parseDouble(numberOne.getText());
            v2 = Double.parseDouble(numberTwo.getText());
            if(v2 == 0){
                resulFinal.setText("Não pode dividir por zero");
                return;
            }
            
            re = v1 / v2;

            s = "" + re;

            resulFinal.setText(s);
        } catch (Exception e) {
        }
    }
    

    @FXML
    void multiplicando(ActionEvent event) throws Exception{
        try {
            verificaDados(numberOne, numberTwo);
            Double v1,v2,re;
            String s;
            v1 = Double.parseDouble(numberOne.getText());
            v2 = Double.parseDouble(numberTwo.getText());
            
            re = v1 * v2;

            s = "" + re;

            resulFinal.setText(s);
        } catch (Exception e) {
        }

    }

    @FXML
    void somando(ActionEvent event) throws Exception {
        try {
            verificaDados(numberOne, numberTwo);
            Double v1,v2,re;
            String s;
            v1 = Double.parseDouble(numberOne.getText());
            v2 = Double.parseDouble(numberTwo.getText());
            
            re = v1 + v2;

            s = "" + re;

            resulFinal.setText(s);
        } catch (Exception e) {
        }
    }

    @FXML
    void subtraindo(ActionEvent event) throws Exception{
        try {
            verificaDados(numberOne, numberTwo);
            Double v1,v2,re;
            String s;
            v1 = Double.parseDouble(numberOne.getText());
            v2 = Double.parseDouble(numberTwo.getText());
            if(v1 > v2){
                re = v1 - v2;
            }else{
                re = v2 - v1;
            }

            s = "" + re;

            resulFinal.setText(s);
        } catch (Exception e) {
        }
    }

    void verificaDados(TextField vl1, TextField vl2 )throws Exception{
        try {
            Double x = Double.parseDouble(vl1.getText());
            Double y = Double.parseDouble(vl2.getText());
        } catch (NumberFormatException e) {
            numberOne.setText(null);
            numberTwo.setText(null);
            resulFinal.setText(null);
            resulFinal.setText("Campo com texto");
        } catch(NullPointerException e){
            numberOne.setText(null);
            numberTwo.setText(null);
            resulFinal.setText(null);
            resulFinal.setText("Campo vazio");
        }
    }

}
