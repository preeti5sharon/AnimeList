package github.preeti5sharon.animelist.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeListService {

    @GET("anime")
    suspend fun getAnimeList(
        @Query("page") page: Int = 1,
        @Query("offset") limit: Int = 15,
    ): Response<AnimeListModel>

    @GET("anime/{id}/full")
    suspend fun getAnimeList(
        @Path("id") id: Int,
    ): Response<AnimeDetailModel>
}
