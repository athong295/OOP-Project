module fifa {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens TroChoi to javafx.fxml;
    exports TroChoi;
}
