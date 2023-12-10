package github.preeti5sharon.animelist.domain


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListModel(
    val `data`: List<Data?>?,
    val pagination: Pagination?
) {
    @JsonClass(generateAdapter = true)
    data class Data(
        val airing: Boolean?,
        val approved: Boolean?,
        val duration: String?,
        val episodes: Int?,
        val images: Images?,
        @Json(name = "mal_id")
        val malId: Int?,
        val popularity: Int?,
        val rank: Int?,
        val score: Double?,
        val status: String?,
        val title: String?,
        @Json(name = "title_english")
        val titleEnglish: String?,
        @Json(name = "title_japanese")
        val titleJapanese: String?,
        val type: String?,
        val url: String?
    ) {
        @JsonClass(generateAdapter = true)
        data class Images(
            val jpg: Jpg?,
            val webp: Webp?
        ) {
            @JsonClass(generateAdapter = true)
            data class Jpg(
                @Json(name = "image_url")
                val imageUrl: String?,
                @Json(name = "large_image_url")
                val largeImageUrl: String?,
                @Json(name = "small_image_url")
                val smallImageUrl: String?
            )

            @JsonClass(generateAdapter = true)
            data class Webp(
                @Json(name = "image_url")
                val imageUrl: String?,
                @Json(name = "large_image_url")
                val largeImageUrl: String?,
                @Json(name = "small_image_url")
                val smallImageUrl: String?
            )
        }
    }

    @JsonClass(generateAdapter = true)
    data class Pagination(
        @Json(name = "current_page")
        val currentPage: Int?,
        @Json(name = "has_next_page")
        val hasNextPage: Boolean?,
        val items: Items?,
        @Json(name = "last_visible_page")
        val lastVisiblePage: Int?
    ) {
        @JsonClass(generateAdapter = true)
        data class Items(
            val count: Int?,
            @Json(name = "per_page")
            val perPage: Int?,
            val total: Int?
        )
    }
}