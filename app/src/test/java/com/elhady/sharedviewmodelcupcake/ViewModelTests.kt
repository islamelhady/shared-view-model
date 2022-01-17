package com.elhady.sharedviewmodelcupcake

import com.elhady.sharedviewmodelcupcake.viewmodel.OrderViewModel
import org.junit.Before

class ViewModelTests {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: OrderViewModel

    @Before
    fun setup(){
        viewModel = OrderViewModel()
    }

    @Test
    fun quantity_twelve_cupcakes(){
        viewModel.setQuantity(12)
        assertEquals(12, viewModel.quantity.value)
    }

    @Test
    fun price_twelve_cupcakes(){
        viewModel.setQuantity(12)
        viewModel.price.observeForever{}
        assertEquals("$27.00", viewModel.price.value)

    }
}