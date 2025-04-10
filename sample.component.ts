import { Component } from '@angular/core';
import { Data } from '@angular/router';
import { LoginserviceService } from '../util/service/loginservice.service';
import { DataMap } from '../AppTypes/Apptypes';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-sample',
  standalone: true,
  imports: [FormsModule, CommonModule],
  templateUrl: './sample.component.html',
  styleUrl: './sample.component.css'
})
export class SampleComponent {
  model:DataMap={};
  data:Data;  
  constructor( private loginService: LoginserviceService) {
  }

ngOnInit(){
 this.getData();
}
getData(){
  this.loginService.getData(this.model).subscribe(
    data => {
      this.data = data;
      this.model = this.data;
    });
}
}
