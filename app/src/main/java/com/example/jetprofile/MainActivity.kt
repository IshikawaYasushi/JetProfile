package com.example.jetprofile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetprofile.ui.theme.JetProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(20.dp)
                    ) {
                        //プロフィール画像
                        Image(
                            painter = painterResource(id = R.drawable.img_profiler),
                            contentDescription = "プロフィール",
                            modifier = Modifier
                                .size(100.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        //名前
                        Text(
                            text = "石川　恭司",
                            color = Color.Gray,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.ExtraBold,
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        //職業
                        Text(
                            text = "職業：androidエンジニア",
                            color = Color.Gray,
                            fontWeight = FontWeight.ExtraBold
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        Column(
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            // 会社名
                            Text(
                                text = "五右衛門カンパニー",
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "DXカンパニー テクノロジグループ",
                                color = Color.Gray,
                                fontSize = 16.sp
                            )
                            Spacer(modifier = Modifier.height(20.dp))
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    imageVector = Icons.Default.Email,
                                    contentDescription = "Email"
                                )
                                Spacer(modifier = Modifier.width(10.dp))
                                Text(text = "email", fontSize = 14.sp, fontWeight = FontWeight.Bold)

                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(text = "iyasu125ever@gmail.com", fontSize = 16.sp)
                            Spacer(modifier = Modifier.height(5.dp))
                            Divider(
                                modifier = Modifier.clip(
                                    RoundedCornerShape(1000.dp),
                                ),
                                thickness = 2.dp
                            )
                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        //詳細表示ボタン
                        Button(modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(backgroundColor = Color(color = 0xFFF85F6A)),
                            onClick = { /*TODO*/ }) {
                            Text(text = "詳細を表示", color = Color.White)
                        }
                        Spacer(modifier = Modifier.height(20.dp))

                        //趣味と居住地域

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(10.dp))
                                .background(Color.LightGray.copy(alpha = 0.3f))
                                .padding(horizontal = 10.dp, vertical = 20.dp)
                        ) {
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Label() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            imageVector = Icons.Default.Email,
            contentDescription = "Email"
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "email", fontSize = 14.sp, fontWeight = FontWeight.Bold)
    }

}