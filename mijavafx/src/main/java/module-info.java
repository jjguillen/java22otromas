module org.jaroso.mijavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.jaroso.mijavafx to javafx.fxml;
    exports org.jaroso.mijavafx;
}
