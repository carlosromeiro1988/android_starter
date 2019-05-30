package com.vw.nano.common

/**
 * Interface which defines the standard methods used in a set of unit tests
 */
interface IBaseTest {
    /**
     * Run this before each test is run
     */
    fun setup()

    /**
     * Creates the mocked instances
     */
    fun createMockedInstances()

    /**
     * Creates the static mocked instances
     */
    fun createStaticMocks()

    /**
     * Creates the mocked bindings required to initialize the parameters
     * consumed in each test case
     */
    fun createMockedBindings()

    /**
     * Releases the static mocks created previously to deal with the
     * static methods
     */
    fun releaseMocks()
}