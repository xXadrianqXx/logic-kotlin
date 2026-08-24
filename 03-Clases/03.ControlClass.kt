// ===== 1. ITEM (ABSTRACT) =====
abstract class Item(
    val id: Int,
    val titulo: String,
    var disponible: Boolean = true
) {
    init {
        // ✅ require: id > 0
        // ✅ require: titulo no vacío
        // COMPLETA AQUÍ
    }
    
    abstract fun prestar()
    abstract fun devolver()
    
    fun mostrarInfo() {
        // COMPLETA AQUÍ
    }
}

// ===== 2. LIBRO =====
class Libro(
    id: Int,
    titulo: String,
    val autor: String,
    val paginas: Int
) : Item(id, titulo) {
    init {
        // ✅ require: autor no vacío
        // ✅ require: paginas > 0
        // COMPLETA AQUÍ
    }
    
    override fun prestar() {
        // ✅ check: que esté disponible
        // ✅ Si lo está, marcar como no disponible
        // ✅ Si no, lanzar error
        // COMPLETA AQUÍ
    }
    
    override fun devolver() {
        // ✅ check: que NO esté disponible
        // ✅ Si no lo está, marcar como disponible
        // ✅ Si ya está disponible, lanzar error
        // COMPLETA AQUÍ
    }
}

// ===== 3. REVISTA =====
class Revista(
    id: Int,
    titulo: String,
    val numeroEdicion: Int
) : Item(id, titulo) {
    init {
        // ✅ require: numeroEdicion > 0
        // COMPLETA AQUÍ
    }
    
    override fun prestar() {
        // COMPLETA AQUÍ (igual que Libro)
    }
    
    override fun devolver() {
        // COMPLETA AQUÍ (igual que Libro)
    }
}

// ===== 4. BIBLIOTECA =====
class Biblioteca {
    private val items = mutableListOf<Item>()
    
    fun agregar(item: Item) {
        // ✅ check: que no exista otro item con el mismo ID
        // ✅ Si no existe, agregar
        // ✅ Si existe, lanzar error
        // COMPLETA AQUÍ
    }
    
    fun buscarPorId(id: Int): Item? {
        // COMPLETA AQUÍ
    }
    
    fun buscarPorTitulo(titulo: String): List<Item> {
        // ✅ require: titulo no vacío
        // COMPLETA AQUÍ
    }
    
    fun prestarItem(id: Int) {
        // ✅ checkNotNull: que el item exista
        // ✅ Llamar a prestar()
        // COMPLETA AQUÍ
    }
    
    fun devolverItem(id: Int) {
        // ✅ checkNotNull: que el item exista
        // ✅ Llamar a devolver()
        // COMPLETA AQUÍ
    }
    
    fun mostrarDisponibles() {
        // COMPLETA AQUÍ
    }
    
    fun mostrarPrestados() {
        // COMPLETA AQUÍ
    }
    
    fun contarItems(): Int {
        // ✅ assert: que el resultado sea >= 0
        // COMPLETA AQUÍ
    }
    
    fun limpiar() {
        // TODO("Implementar limpieza de todos los items")
        // COMPLETA AQUÍ
    }
}

// ===== 5. MAIN =====
fun main() {
    val biblioteca = Biblioteca()
    
    // 1. Agregar items
    val libro1 = Libro(1, "El Principito", "Antoine", 96)
    val libro2 = Libro(2, "1984", "Orwell", 328)
    val revista = Revista(3, "National Geographic", 45)
    
    biblioteca.agregar(libro1)
    biblioteca.agregar(libro2)
    biblioteca.agregar(revista)
    
    // 2. Mostrar disponibles
    biblioteca.mostrarDisponibles()
    
    // 3. Prestar un libro
    biblioteca.prestarItem(1)
    
    // 4. Mostrar disponibles después del préstamo
    biblioteca.mostrarDisponibles()
    
    // 5. Devolver el libro
    biblioteca.devolverItem(1)
    
    // 6. Mostrar disponibles después de la devolución
    biblioteca.mostrarDisponibles()
    
    // 7. Intentar prestar un item inexistente
    try {
        biblioteca.prestarItem(99)
    } catch (e: Exception) {
        println("❌ ${e.message}")
    }
    
    // 8. Contar items
    println("\n📊 Total de items: ${biblioteca.contarItems()}")
}
