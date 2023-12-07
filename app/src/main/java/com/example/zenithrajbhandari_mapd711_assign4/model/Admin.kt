import androidx.room.Entity
import androidx.room.PrimaryKey

//Each @Entity class represents a SQLite table.
//Entity corresponds to a table in the associated Room database, and each instance of an entity represents a row of data in the corresponding table.
@Entity(tableName = "Admin")
data class Admin(
    //Each Room entity must define a primary key that uniquely identifies each row in the corresponding database table.
    @PrimaryKey(autoGenerate = true)
    val employeeId: Long = 0,
    val userName: String,
    val password: String,
    val firstname: String,
    val lastname: String,

)

