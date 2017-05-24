import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import {Login} from "./service";
import {TestComponent} from "./test.component";
import {LinktestComponent} from "./linktest.component";
import {routing} from "./app.routing";
import {LoginDialogComponent} from "./login.component";
import {SignUpComponent} from "./signup.component";

@NgModule({
  declarations: [
    AppComponent,
    LoginDialogComponent,
    TestComponent,
    LinktestComponent,
    SignUpComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing
  ],
  providers: [Login],
  bootstrap: [AppComponent]
})
export class AppModule { }
