package com.vw.nano.ui.login

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleRegistry
import com.vw.nano.common.BaseTest
import com.vw.nano.data.user.IUserRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import io.mockk.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test

/**
 * Class which holds the different test cases to be applied for each of the methods
 * exposed by the LoginViewModel class.
 */
class LoginViewModelTest : BaseTest() {

    private lateinit var viewModel: LoginViewModel

    private val userRepository = mockk<IUserRepository>()

    /**
     * This field is used to allow the test of the
     * LiveData wrapper in the unit tests
     */
    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    /**
     * Mocked lifecycle registry used to initialize the
     * observer call
     */
    private val mockedLifecycleRegistry =
        LifecycleRegistry(mockk()).apply { handleLifecycleEvent(Lifecycle.Event.ON_RESUME) }

    /**
     * Run this before each test is run
     */
    @Before
    override fun setup() {
        viewModel = spyk(LoginViewModel(userRepository), recordPrivateCalls = true)
    }

    /**
     * Creates the mocked instances
     */
    override fun createMockedInstances() {
    }

    /**
     * Creates the static mocked instances
     */
    override fun createStaticMocks() {
    }

    /**
     * Creates the mocked bindings required to initialize the parameters
     * consumed in each test case
     */
    override fun createMockedBindings() {
    }

    /**
     * Tests the login method when a null password and username are provided
     * by checking if the inner repository method is reached
     */
    @Test
    fun testLoginByCheckingIfTheRepositoryMethodIsCalledWhenNoPasswordAndUsernameAreProvided() {
        viewModel.login()

        verify(exactly = 0) {
            userRepository.login(any(), any())
        }
    }

    /**
     * Tests the login method when an empty password and username are provided
     * by checking if the inner repository method is reached
     */
    @Test
    fun testLoginByCheckingIfTheRepositoryMethodIsCalledWhenAnEmptyPasswordAndUsernameAreProvided() {
        every {
            viewModel.username.value
        } returns ""

        every {
            viewModel.password.value
        } returns ""

        viewModel.login()

        verify(exactly = 0) {
            userRepository.login(any(), any())
        }
    }

    /**
     * Tests the login method when an blank password and username are provided
     * by checking if the inner repository method is reached
     */
    @Test
    fun testLoginByCheckingIfTheRepositoryMethodIsCalledWhenAnBlankPasswordAndUsernameAreProvided() {
        every {
            viewModel.username.value
        } returns " "

        every {
            viewModel.password.value
        } returns " "

        viewModel.login()

        verify(exactly = 0) {
            userRepository.login(any(), any())
        }
    }

    /**
     * Tests the login method when an blank password and username are provided
     * by checking if the inner repository method is reached
     */
    @Test
    fun testLoginByCheckingIfTheRepositoryMethodIsCalledWhenAnInvalidPasswordAndUsernameAreProvided() {
        every {
            viewModel.username.value
        } returns " "

        every {
            viewModel.password.value
        } returns " "

        viewModel.login()

        verify(exactly = 0) {
            userRepository.login(any(), any())
        }
    }
}