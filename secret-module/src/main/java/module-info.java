module secret.module {
    exports com.itechart.secret.api;
    exports com.itechart.secret.internal to trusted.module;
}