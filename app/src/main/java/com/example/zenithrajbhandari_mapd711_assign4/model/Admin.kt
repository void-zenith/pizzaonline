import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Admin")
data class Admin(
    @PrimaryKey(autoGenerate = true)
    val employeeId: Long = 0,
    val userName: String,
    val password: String,
    val firstname: String,
    val lastname: String,

)