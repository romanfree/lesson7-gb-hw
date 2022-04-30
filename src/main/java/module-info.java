module ru.gb.lesson7gbhw {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.lesson7gbhw to javafx.fxml;
    exports ru.gb.lesson7gbhw;
}