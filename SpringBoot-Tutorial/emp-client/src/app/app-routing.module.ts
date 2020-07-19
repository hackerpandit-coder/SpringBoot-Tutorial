import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {RouterGuardService} from './service/router-guard.service';
import { RegistrationFormComponent } from './component/registration-form/registration-form.component';
import { LoginComponent } from './component/login/login.component';
import { MenuBarComponent } from './component/menu-bar/menu-bar.component';



const routes: Routes = [
  {path: '', component: MenuBarComponent},
  {path: 'login', component: LoginComponent },
  { path:'register' , component: RegistrationFormComponent},
  {path:'menu', component: MenuBarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]  
})
export class AppRoutingModule { }
