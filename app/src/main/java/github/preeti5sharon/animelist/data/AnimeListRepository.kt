package github.preeti5sharon.animelist.data

class AnimeListRepository(private val service: AnimeListService) {
    suspend fun getAnimeList(page: Int, limit: Int) = service.getAnimeList(page, limit)
}
