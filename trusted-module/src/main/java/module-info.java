import com.itechart.trusted.Service;
import com.itechart.trusted.ServiceA;

module trusted.module {
    requires secret.module;
    provides Service with ServiceA;
    exports com.itechart.trusted;
}