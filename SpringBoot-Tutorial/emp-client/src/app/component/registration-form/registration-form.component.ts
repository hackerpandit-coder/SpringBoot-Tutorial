import { Component, OnInit } from '@angular/core';
import { HttpDataService } from 'src/app/service/http-data.service';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-registration-form',
  templateUrl: './registration-form.component.html',
  styleUrls: ['./registration-form.component.css']
})
export class RegistrationFormComponent implements OnInit {

  cities;
  technologies;
  registrationForm:any={}

  constructor(private http:HttpDataService) { }

  ngOnInit(): void {


    this.getData();
  }

  onSubmit() {
    console.log('--inside submit---');
    this.http.post('registerUser',this.registrationForm).subscribe(
      (res) =>{console.log(res);},
      (err) => {},
      () =>{}
    )
        console.table(this.registrationForm);
  }

  getData(){
    this.http.post('fetchData',{}).subscribe(
      res => {
        this.cities = res['data']['cities']
        this.technologies = res['data']['technologies']
      }
    )
  }
}
