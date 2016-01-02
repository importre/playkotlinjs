package playkotlin

import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.p
import kotlin.browser.document

fun main(args: Array<String>) {

    document.querySelector("body")?.append {
        div(classes = "container") {
            p {
                +"play kotlin js"
            }
        }
    }
}
