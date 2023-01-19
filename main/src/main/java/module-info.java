module com.itechart {
    requires trusted.module;
    requires secret.module;
    uses com.itechart.trusted.Service;

    requires java.net.http;
}
