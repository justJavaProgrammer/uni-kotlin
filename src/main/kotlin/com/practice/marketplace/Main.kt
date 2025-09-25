package com.practice.marketplace

fun main() {
    // TODO : "Define test product"
    val products = listOf<Product>(
    )

    val cart = Cart()
    val addAction = AddProductAction()
    val removeAction = RemoveProductAction()
    val viewAction = ViewCartAction()

    while (true) {
        println("\n=== Marketplace ===")
        println("+----+-----------+--------+")
        println("| ID | Product   | Price  |")
        println("+----+-----------+--------+")
        for (p in products) {
            println("| %-2d | %-9s | $%-5.2f |".format(p.id, p.name, p.price))
        }
        println("+----+-----------+--------+")
        println("Choose action: add <id>, remove <id>, view, exit")

        val input = readLine()?.trim() ?: continue
        if (input == "exit") break

        when {
            input.startsWith("add") -> {
                val id = input.split(" ").getOrNull(1)?.toIntOrNull()
                val product = products.find { it.id == id }
                // TODO : "Execute add action"
                //  if (product != null) addAction.execute(cart, product)
            }

            input.startsWith("remove") -> {
                val id = input.split(" ").getOrNull(1)?.toIntOrNull()
                val product = products.find { it.id == id }
                // TODO : "Execute remove action"
                // if (product != null) removeAction.execute(cart, product)
            }

            input == "view" -> {
                // TODO : "Execute view action"
                // viewAction.execute(cart)
            }
            else -> println("Invalid command.")
        }
    }
}
