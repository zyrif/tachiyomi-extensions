package eu.kanade.tachiyomi.multisrc.fmreader

import generator.ThemeSourceData.MultiLang
import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class FMReaderGenerator : ThemeSourceGenerator {

    override val themePkg = "fmreader"

    override val themeClass = "FMReader"

    override val baseVersionCode: Int = 7

    /** For future sources: when testing and popularMangaRequest() returns a Jsoup error instead of results
     *  most likely the fix is to override popularMangaNextPageSelector()   */

    override val sources = listOf(
        SingleLang("Epik Manga", "https://www.epikmanga.com", "tr"),
        SingleLang("KissLove", "https://klmag.net", "ja", overrideVersionCode = 1),
        SingleLang("Manga-TR", "https://manga-tr.com", "tr", className = "MangaTR", overrideVersionCode = 1),
        SingleLang("Manhwa18", "https://manhwa18.com", "en", isNsfw = true, overrideVersionCode = 2),
        MultiLang("Manhwa18.net", "https://manhwa18.net", listOf("en", "ko"), className = "Manhwa18NetFactory", isNsfw = true),
        SingleLang("WeLoveManga", "https://weloma.net", "ja", pkgName = "rawlh", overrideVersionCode = 3),
        SingleLang("Say Truyen", "https://saytruyen.net", "vi", overrideVersionCode = 2),
        SingleLang("ManhuaRock", "https://manhuarock.net", "vi", overrideVersionCode = 1),
        SingleLang("KSGroupScans", "https://ksgroupscans.com", "en", overrideVersionCode = 1),
        // Sites that went down
        // SingleLang("18LHPlus", "https://18lhplus.com", "en", className = "EighteenLHPlus"),
        // SingleLang("HanaScan (RawQQ)", "https://hanascan.com", "ja", className = "HanaScanRawQQ"),
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            FMReaderGenerator().createAll()
        }
    }
}
