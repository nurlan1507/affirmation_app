package com.example.affirmation_app

import android.content.Context
import com.example.affirmation_app.adapter.ItemAdapter
import com.example.affirmation_app.model.Affirmation
import org.junit.Test

import org.junit.Assert.*
import org.mockito.Mockito.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val context = mock(Context::class.java)



    @Test
    fun adapter_size(){
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context,data)
        assertEquals("ItemAdapter dataset length is not equal to datasource length", data.size, adapter.itemCount)
    }



    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}