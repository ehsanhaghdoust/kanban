package ehsan.haghdoust.kanban.repository.webservice

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApiClient {

    private lateinit var kanbanClient: Retrofit

    fun getServiceClient(): Retrofit {
        if (!::kanbanClient.isInitialized) {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            val client = OkHttpClient.Builder()
                    .readTimeout(60, TimeUnit.SECONDS)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .addInterceptor(interceptor)
                    .build()
            kanbanClient = Retrofit.Builder()
                    .baseUrl(Urls.BASEURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build()
        }
        return kanbanClient
    }
}


//class CustomInterceptor: Interceptor {
//
//    override fun intercept(chain: Interceptor.Chain): Response {
//        chain.request().url.
//    }
//
//}
