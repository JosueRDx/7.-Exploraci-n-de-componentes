package com.example.componentes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Switch
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.componentes.ui.theme.ComponentesTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponentesTheme {
                //función a probar
                MainScreen()
            }
        }
    }
}


//CONTENEDORES
/*
@Composable
fun LazyRowExample() {
    LazyRow(
        modifier = Modifier.fillMaxSize()
    ) {
        items(10) {
            Text(text = "Item #$it", modifier = Modifier.padding(8.dp))
        }
    }
}
*/

/*
@Composable
fun LazyRowExample() {
    LazyRow(
        modifier = Modifier.fillMaxSize()
    ) {
        items(4) {
            Text(text = "Item #$it", modifier = Modifier.padding(8.dp))
        }
    }
}
*/

/*
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GridExample() {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize()
    ) {
        items(10) {
            Text(text = "Item #$it", modifier = Modifier.padding(8.dp))
        }
    }
}
*/

/*
@Composable
fun ConstraintLayoutExample() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        val (text1, text2) = createRefs()
        Text(
            text = "Text 1",
            modifier = Modifier.constrainAs(text1) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(parent.start, margin = 16.dp)
            }
        )
        Text(
            text = "Text 2",
            modifier = Modifier.constrainAs(text2) {
                top.linkTo(text1.bottom, margin = 16.dp)
                start.linkTo(parent.start, margin = 16.dp)
            }
        )
    }
}
*/

/*
@Composable
fun ScaffoldExample() {
    Scaffold(
        topBar = {
            Text("Top Bar", modifier = Modifier.padding(16.dp))
        }
    ) { paddingValues ->
        Text("Content", modifier = Modifier.padding(paddingValues))
    }
}
*/

/*
@Composable
fun SurfaceExample() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Text(text = "Hello Surface!", modifier = Modifier.padding(16.dp))
    }
}
*/

/*
@Composable
fun ChipExample() {
    Text(text = "Chip", modifier = Modifier.padding(8.dp))
}
*/

/*
@Composable
fun BackdropScaffoldExample() {
    BackdropScaffold(
        appBar = { Text("App Bar") },
        backLayerContent = { Text("Back Layer") },
        frontLayerContent = { Text("Front Layer") }
    )
}
*/

/*
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowRowExample() {
    FlowRow(
        modifier = Modifier.fillMaxSize()
    ) {
        repeat(20) {
            Text(text = "Item $it", modifier = Modifier.padding(8.dp))
        }
    }
}
*/

/*
@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowColumnExample() {
    FlowColumn(
        modifier = Modifier.fillMaxSize()
    ) {
        repeat(81) {
            Text(text = "Item $it", modifier = Modifier.padding(8.dp))
        }
    }
}
*/

//CONTROLES
//1
@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        /*
        AlertDialogExample()
        CardExample()
        CheckboxExample()
        FloatingActionButtonExample()
        IconExample()
        ImageExample()
        ProgressBarExample()
        RadioButtonExample()
        SliderExample()
        SpacerExample()
        SwitchExample()
        TopAppBarExample()

         */


        DialogControl()
        DividerControl()
        DropDownMenuControl()
        LazyVerticalGridControl()
        NavigationRailControl()
        OutlinedTextFieldControl()
        PagerControl()
        SnackbarControl()
        TooltipControl()
    }


}

/*
@Composable
fun AlertDialogExample() {
    var showDialog by remember { mutableStateOf(false) }

    Button(onClick = { showDialog = true }) {
        Text("AlertDialog")
    }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text(text = "Title") },
            text = { Text("This is an alert dialog.") },
            confirmButton = {
                Button(onClick = { showDialog = false }) {
                    Text("OK")
                }
            }
        )
    }
}

@Composable
fun CardExample() {
    Card(modifier = Modifier.fillMaxWidth(), elevation = CardDefaults.cardElevation(8.dp)) {
        Text("Card", modifier = Modifier.padding(16.dp))
    }
}

@Composable
fun CheckboxExample() {
    var checked by remember { mutableStateOf(false) }

    Checkbox(checked = checked, onCheckedChange = { checked = it })
    Text(text = "Checkbox")
}

@Composable
fun FloatingActionButtonExample() {
    FloatingActionButton(onClick = { /* Action */ }) {
        Text("FloatingActionButton")
    }
}

@Composable
fun IconExample() {
    Icon(Icons.Default.Favorite, contentDescription = "Favorite Icon")
}

@Composable
fun ImageExample() {
    BasicText("Image Placeholder")
}

@Composable
fun ProgressBarExample() {
    CircularProgressIndicator()
}

@Composable
fun RadioButtonExample() {
    var selected by remember { mutableStateOf(false) }

    RadioButton(selected = selected, onClick = { selected = !selected })
    Text(text = "RadioButton")
}

@Composable
fun SliderExample() {
    var sliderPosition by remember { mutableStateOf(0f) }

    Slider(value = sliderPosition, onValueChange = { sliderPosition = it })
}

@Composable
fun SpacerExample() {
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
fun SwitchExample() {
    var switched by remember { mutableStateOf(false) }

    Switch(checked = switched, onCheckedChange = { switched = it })
    Text(text = "Switch")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample() {
    TopAppBar(title = { Text("TopAppBar") })
}
*/

//2

@Composable
fun DialogControl() {
    var showDialog by remember { mutableStateOf(false) }
    Button(onClick = { showDialog = true }) {
        Text("Dialog")
    }
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            confirmButton = { Button(onClick = { showDialog = false }) { Text("OK") } },
            text = { Text("This is a dialog.") }
        )
    }
}

@Composable
fun DividerControl() {
    HorizontalDivider(thickness = 5.dp)
}

@Composable
fun DropDownMenuControl() {
    var expanded by remember { mutableStateOf(false) }
    Button(onClick = { expanded = true }) {
        Text("DropDownMenu")
    }
    DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
        DropdownMenuItem(onClick = { /* Handle click */ }) {
            Text("Item 1")
        }
        DropdownMenuItem(onClick = { /* Handle click */ }) {
            Text("Item 2")
        }
    }
}

fun DropdownMenuItem(onClick: () -> Unit, interactionSource: @Composable () -> Unit) {
    TODO("Not yet implemented")
}


@Composable
fun LazyVerticalGridControl() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(2) {
            Card(modifier = Modifier.padding(4.dp)) {
                Text(text = "LazyVerticalGrid $it", modifier = Modifier.padding(16.dp))
            }
        }
    }
}

@Composable
fun NavigationRailControl() {
    NavigationRail(
        modifier = Modifier.height(200.dp)

    ) {
        NavigationRailItem(
            selected = true,
            onClick = {},
            label = { Text("NavigationRail") },
            icon = { Icon(Icons.Filled.Favorite, contentDescription = "Favorites") }
        )
        NavigationRailItem(
            selected = false,
            onClick = {},
            label = { Text("NavigationRail") },
            icon = { Icon(Icons.Filled.Place, contentDescription = "Places") }
        )
    }
}

@Composable
fun OutlinedTextFieldControl() {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(value = text, onValueChange = { text = it }, label = { Text("OutlinedTextField") })
}

@Composable
fun PagerControl() {
    var selectedTabIndex by remember { mutableStateOf(0) }
    val tabs = listOf("Pager 1", "Pager 2", "Pager 3")
    TabRow(selectedTabIndex = selectedTabIndex) {
        tabs.forEachIndexed { index, title ->
            Tab(selected = selectedTabIndex == index, onClick = { selectedTabIndex = index }) {
                Text(text = title)
            }
        }
    }
}

@Composable
fun SnackbarControl() {
    var showSnackbar by remember { mutableStateOf(false) }
    Button(onClick = { showSnackbar = true }) {
        Text("Snackbar")
    }
    if (showSnackbar) {
        Snackbar(
            action = {
                Button(onClick = { showSnackbar = false }) {
                    Text("Dismiss")
                }
            }
        ) { Text("This is a Snackbar.") }
    }
}

@Composable
fun TooltipControl() {
    var showTooltip by remember { mutableStateOf(false) }
    IconButton(onClick = { showTooltip = !showTooltip }) {
        Icon(Icons.Default.Info, contentDescription = "Info")
    }
    if (showTooltip) {
        Text("Tooltip")
    }
}

@Preview(showBackground = false)
@Composable
fun ComponentesPreview() {
    MainScreen()
}