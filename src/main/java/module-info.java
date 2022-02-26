 module me.nadha.dbms {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.mysql.jdbc;


    opens me.nadha.dbms to javafx.fxml;
    exports me.nadha.dbms;
}