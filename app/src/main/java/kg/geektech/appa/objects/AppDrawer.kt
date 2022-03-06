package kg.geektech.appa.objects

import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.mikepenz.materialdrawer.AccountHeader
import com.mikepenz.materialdrawer.AccountHeaderBuilder
import com.mikepenz.materialdrawer.Drawer
import com.mikepenz.materialdrawer.DrawerBuilder
import com.mikepenz.materialdrawer.model.DividerDrawerItem
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem
import com.mikepenz.materialdrawer.model.ProfileDrawerItem
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem
import kg.geektech.appa.R
import kg.geektech.appa.ui.settings.SettingsFragment

class AppDrawer(
    private val activity: AppCompatActivity,
    private val toolbar: Toolbar
) {

    private lateinit var mDrawer: Drawer
    private lateinit var mHeader: AccountHeader

    fun create() {
        createHeader()
        createDrawer()
    }

    private fun createDrawer() {
        mDrawer = DrawerBuilder()
            .withActivity(activity)
            .withToolbar(toolbar)
            .withActionBarDrawerToggle(true)
            .withSelectedItem(-1)
            .withAccountHeader(mHeader)
            .addDrawerItems(
                PrimaryDrawerItem()
                    .withIdentifier(100L)
                    .withIconTintingEnabled(true)
                    .withName("Создать группу")
                    .withSelectable(true)
                    .withIcon(R.drawable.ic_menu_create_groups),
                PrimaryDrawerItem()
                    .withIdentifier(101L)
                    .withIconTintingEnabled(true)
                    .withName("Создать секретный чат")
                    .withSelectable(true)
                    .withIcon(R.drawable.ic_menu_secret_chat),
                PrimaryDrawerItem()
                    .withIdentifier(102L)
                    .withIconTintingEnabled(true)
                    .withName("Создать канал")
                    .withSelectable(true)
                    .withIcon(R.drawable.ic_menu_create_channel),
                PrimaryDrawerItem()
                    .withIdentifier(103L)
                    .withIconTintingEnabled(true)
                    .withName("Контакты")
                    .withSelectable(true)
                    .withIcon(R.drawable.ic_menu_contacts),
                PrimaryDrawerItem()
                    .withIdentifier(104L)
                    .withIconTintingEnabled(true)
                    .withName("Звонки")
                    .withSelectable(true)
                    .withIcon(R.drawable.ic_menu_phone),
                PrimaryDrawerItem()
                    .withIdentifier(105L)
                    .withIconTintingEnabled(true)
                    .withName("Избранное")
                    .withSelectable(true)
                    .withIcon(R.drawable.ic_menu_favorites),
                PrimaryDrawerItem()
                    .withIdentifier(106L)
                    .withIconTintingEnabled(true)
                    .withName("Настройки")
                    .withSelectable(true)
                    .withIcon(R.drawable.ic_menu_settings),
                DividerDrawerItem(),
                PrimaryDrawerItem()
                    .withIdentifier(107L)
                    .withIconTintingEnabled(true)
                    .withName("Пригласить друзей")
                    .withSelectable(true)
                    .withIcon(R.drawable.ic_menu_invate),
                PrimaryDrawerItem()
                    .withIdentifier(108L)
                    .withIconTintingEnabled(true)
                    .withName("Вопросы о телеграм")
                    .withSelectable(true)
                    .withIcon(R.drawable.ic_menu_help)
            )
            .withOnDrawerItemClickListener(object : Drawer.OnDrawerItemClickListener {
                override fun onItemClick(
                    view: View?,
                    position: Int,
                    drawerItem: IDrawerItem<*>
                ): Boolean {

                    when (drawerItem.identifier) {
                        106L -> {
                            replaceFragment(SettingsFragment())
                        }
                    }
                    return false
                }
            }).build()
    }

    private fun replaceFragment(fragment: Fragment) {
        activity.supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.fragment_container_view, fragment).commit()
    }

    private fun createHeader() {
        mHeader = AccountHeaderBuilder()
            .withActivity(activity)
            .withHeaderBackground(R.color.purple_500)
            .addProfiles(
                ProfileDrawerItem()
                    .withName("Aziz")
                    .withEmail("+996990040770")
            ).build()
    }
}