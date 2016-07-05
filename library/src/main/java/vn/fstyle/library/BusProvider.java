package vn.fstyle.library;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * BusProvider.
 *
 * @author DaoLQ
 */
public class BusProvider {
    private static final Bus sBus = new Bus(ThreadEnforcer.ANY);

    private BusProvider() {
        // No-op
    }

    public static Bus getInstance() {
        return sBus;
    }
}
