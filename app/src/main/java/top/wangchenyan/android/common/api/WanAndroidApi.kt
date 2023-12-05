package top.wangchenyan.android.common.api

import me.wcy.common.net.NetResult
import me.wcy.common.net.gson.GsonConverterFactory
import me.wcy.common.utils.GsonUtils
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by wangchenyan.top on 2023/12/5.
 */
interface WanAndroidApi {

    @GET("article/list/{page}/json")
    suspend fun getHomeArticleList(@Path("page") page: Int = 0): NetResult<ArticleList>

    companion object {
        private val api: WanAndroidApi by lazy {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://www.wanandroid.com/")
                .addConverterFactory(GsonConverterFactory.create(GsonUtils.gson, true))
                .client(OkHttpClient.Builder().build())
                .build()
            retrofit.create(WanAndroidApi::class.java)
        }

        fun get(): WanAndroidApi = api
    }
}