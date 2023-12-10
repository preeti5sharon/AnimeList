package github.preeti5sharon.animelist.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AnimeListModel(
    val `data`: List<Data?>?,
    val pagination: Pagination?,
) {
    @JsonClass(generateAdapter = true)
    data class Data(
        val aired: Aired?,
        val airing: Boolean?,
        val approved: Boolean?,
        val background: String?,
        val broadcast: Broadcast?,
        val demographics: List<Any?>?,
        val duration: String?,
        val episodes: Int?,
        @Json(name = "explicit_genres")
        val explicitGenres: List<Any?>?,
        val favorites: Int?,
        val genres: List<Genre?>?,
        val images: Images?,
        val licensors: List<Licensor?>?,
        @Json(name = "mal_id")
        val malId: Int?,
        val members: Int?,
        val popularity: Int?,
        val producers: List<Producer?>?,
        val rank: Int?,
        val rating: String?,
        val score: Double?,
        @Json(name = "scored_by")
        val scoredBy: Int?,
        val season: String?,
        val source: String?,
        val status: String?,
        val studios: List<Studio?>?,
        val synopsis: String?,
        val themes: List<Theme?>?,
        val title: String?,
        @Json(name = "title_english")
        val titleEnglish: String?,
        @Json(name = "title_japanese")
        val titleJapanese: String?,
        @Json(name = "title_synonyms")
        val titleSynonyms: List<Any?>?,
        val titles: List<Title?>?,
        val trailer: Trailer?,
        val type: String?,
        val url: String?,
        val year: Int?,
    ) {
        @JsonClass(generateAdapter = true)
        data class Aired(
            val from: String?,
            val prop: Prop?,
            val string: String?,
            val to: String?,
        ) {
            @JsonClass(generateAdapter = true)
            data class Prop(
                val from: From?,
                val to: To?,
            ) {
                @JsonClass(generateAdapter = true)
                data class From(
                    val day: Int?,
                    val month: Int?,
                    val year: Int?,
                )

                @JsonClass(generateAdapter = true)
                data class To(
                    val day: Int?,
                    val month: Int?,
                    val year: Int?,
                )
            }
        }

        @JsonClass(generateAdapter = true)
        data class Broadcast(
            val day: String?,
            val string: String?,
            val time: String?,
            val timezone: String?,
        )

        @JsonClass(generateAdapter = true)
        data class Genre(
            @Json(name = "mal_id")
            val malId: Int?,
            val name: String?,
            val type: String?,
            val url: String?,
        )

        @JsonClass(generateAdapter = true)
        data class Images(
            val jpg: Jpg?,
            val webp: Webp?,
        ) {
            @JsonClass(generateAdapter = true)
            data class Jpg(
                @Json(name = "image_url")
                val imageUrl: String?,
                @Json(name = "large_image_url")
                val largeImageUrl: String?,
                @Json(name = "small_image_url")
                val smallImageUrl: String?,
            )

            @JsonClass(generateAdapter = true)
            data class Webp(
                @Json(name = "image_url")
                val imageUrl: String?,
                @Json(name = "large_image_url")
                val largeImageUrl: String?,
                @Json(name = "small_image_url")
                val smallImageUrl: String?,
            )
        }

        @JsonClass(generateAdapter = true)
        data class Licensor(
            @Json(name = "mal_id")
            val malId: Int?,
            val name: String?,
            val type: String?,
            val url: String?,
        )

        @JsonClass(generateAdapter = true)
        data class Producer(
            @Json(name = "mal_id")
            val malId: Int?,
            val name: String?,
            val type: String?,
            val url: String?,
        )

        @JsonClass(generateAdapter = true)
        data class Studio(
            @Json(name = "mal_id")
            val malId: Int?,
            val name: String?,
            val type: String?,
            val url: String?,
        )

        @JsonClass(generateAdapter = true)
        data class Theme(
            @Json(name = "mal_id")
            val malId: Int?,
            val name: String?,
            val type: String?,
            val url: String?,
        )

        @JsonClass(generateAdapter = true)
        data class Title(
            val title: String?,
            val type: String?,
        )

        @JsonClass(generateAdapter = true)
        data class Trailer(
            @Json(name = "embed_url")
            val embedUrl: String?,
            val images: Images?,
            val url: String?,
            @Json(name = "youtube_id")
            val youtubeId: String?,
        ) {
            @JsonClass(generateAdapter = true)
            data class Images(
                @Json(name = "image_url")
                val imageUrl: String?,
                @Json(name = "large_image_url")
                val largeImageUrl: String?,
                @Json(name = "maximum_image_url")
                val maximumImageUrl: String?,
                @Json(name = "medium_image_url")
                val mediumImageUrl: String?,
                @Json(name = "small_image_url")
                val smallImageUrl: String?,
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
        val lastVisiblePage: Int?,
    ) {
        @JsonClass(generateAdapter = true)
        data class Items(
            val count: Int?,
            @Json(name = "per_page")
            val perPage: Int?,
            val total: Int?,
        )
    }
}
