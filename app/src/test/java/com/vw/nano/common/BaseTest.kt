package com.vw.nano.common

import io.mockk.unmockkAll

/**
 * Class which implements the common method used by all the unit tests
 * and exposes the remaining methods to be used in each test set
 */
abstract class BaseTest : IBaseTest {
    /**
     * Releases the static mocks created previously to deal with the
     * static methods
     */
    override fun releaseMocks() {
        unmockkAll()
    }
}