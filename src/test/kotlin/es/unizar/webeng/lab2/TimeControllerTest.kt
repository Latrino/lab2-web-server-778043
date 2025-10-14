package es.unizar.webeng.lab2

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import java.time.LocalDateTime

@SpringBootTest
@AutoConfigureMockMvc
class TimeControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var objectMapper: ObjectMapper

    @Test
    fun `time endpoint returns valid timeDTO`() {
        val result =
            mockMvc
                .get("/time")
                .andExpect { status { isOk() } }
                .andReturn()

        val json = result.response.contentAsString
        val dto = objectMapper.readValue<TimeDTO>(json)
        // Verifica que el campo 'time' no sea nulo y sea una fecha válida
        assertEquals(true, dto.time is LocalDateTime)
    }
}
