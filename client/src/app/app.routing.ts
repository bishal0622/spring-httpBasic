import { ModuleWithProviders } from '@angular/core';

import {Routes, RouterModule} from "@angular/router";
import {LinktestComponent} from "./linktest.component";
import {LoginDialogComponent} from "./login.component";
import {TestComponent} from "./test.component";
import {AppComponent} from "./app.component";
import {SignUpComponent} from "./signup.component";


export const testRoute:Routes=[
  {
    path: '',
    component: AppComponent
  },
  {
    path: 'signup',
    component: SignUpComponent
  },
  {
    path:'test',
    component:LinktestComponent
  },
  {
    path:'login',
    component:LoginDialogComponent
  },
  {
    path:'logout',
    component:TestComponent
  }
];

export const routing: ModuleWithProviders = RouterModule.forRoot(testRoute);
